class RemoveElement():
    def __init__(self, nums, val):
        self.nums = nums
        self.val = val

    # Brute force
    def function1(self):
        length = len(self.nums)
        for i in range(len(self.nums)):
            if self.nums[i] == self.val:
                length = length - 1
                for j in range(i, len(self.nums) - 1):
                    self.nums[j] = self.nums[j + 1]

        return length

    # Double pointer method
    def function2(self):
        slowIndex = 0
        for fastIndex in range(len(self.nums)):
            if self.nums[fastIndex] != self.val:
                self.nums[slowIndex] = self.nums[fastIndex]
                slowIndex += 1
        return slowIndex


nums = [0, 1, 0, 2, 0, 3]
val = 0
test = RemoveElement(nums, val)
print(test.function2())