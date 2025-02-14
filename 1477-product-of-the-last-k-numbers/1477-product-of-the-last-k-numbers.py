class ProductOfNumbers:

    def __init__(self):
        self.l = [1]

    def add(self, num: int) -> None:
        if num == 0:
            self.l = [1]
        else:
            new_num = self.l[-1]
            self.l.append(new_num*num)

    def getProduct(self, k: int) -> int:
        if len(self.l) <= k:
            return 0
        
        return self.l[-1] // self.l[-1-k]


# Your ProductOfNumbers object will be instantiated and called as such:
# obj = ProductOfNumbers()
# obj.add(num)
# param_2 = obj.getProduct(k)