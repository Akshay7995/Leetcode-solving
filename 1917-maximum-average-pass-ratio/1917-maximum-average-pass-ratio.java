import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> q = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        for (int[] cls : classes) {
            int pass = cls[0];
            int total = cls[1];
            double gain = helper(pass, total);
            q.offer(new double[] {gain, pass, total});
        }
        while (extraStudents > 0) {
            double[] top = q.poll();
            int pass = (int) top[1];
            int total = (int) top[2];

            pass++;
            total++;

            double gain = helper(pass, total);
            q.offer(new double[] {gain, pass, total});

            extraStudents--;
        }

        double avg = 0.0;
        while (!q.isEmpty()) {
            double[] top = q.poll();
            int pass = (int) top[1];
            int total = (int) top[2];
            avg += (double) pass / total;
        }

        return avg / classes.length;
    }

    static double helper(int pass, int total) {
        double currentRatio = (double) pass / total;
        double newRatio = (double) (pass + 1) / (total + 1);
        return newRatio - currentRatio;
    }
}
