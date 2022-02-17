class BinarySearch():
    def __init__(self, nums, target):
        self.nums = nums
        self.target = target
        self.left = 0
        self.right = 0
        self.mid = 0

    def funcition1(self):
        self.right = len(self.nums) - 1
        while self.left <= self.right:
            self.mid = int((self.left + self.right) / 2)
            if self.nums[self.mid] == self.target:
                return self.mid
            if self.nums[self.mid] > self.target:
                self.right = self.mid - 1
            if self.nums[self.mid] < self.target:
                self.left = self.mid + 1
        return -1

    def funcition2(self):
        self.right = len(nums)
        while self.left < self.right:
            self.mid = int((self.left + self.right) / 2)
            if self.nums[self.mid] == self.target:
                return self.mid
            if self.nums[self.mid] > self.target:
                self.right = self.mid
            if self.nums[self.mid] < self.target:
                self.left = self.mid + 1
        return -1


nums = [1, 2, 3, 4, 5, 6]
target = 6
search = BinarySearch(nums, target)
print(search.funcition2())
