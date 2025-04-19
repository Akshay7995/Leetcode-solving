class Solution:
    def maximumPopulation(self, logs: List[List[int]]) -> int:
        population = [0]*101

        for birth,death in logs:
            population[birth-1950]+=1
            population[death-1950] -=1
        
        max_population = 0
        running_population = 0
        ans = 0
        for year in range(101):
            running_population +=population[year]
            if running_population > max_population:
                max_population = running_population
                ans = 1950+year

        return ans