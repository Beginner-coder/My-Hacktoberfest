"""
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
"""

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = {}
        for key, value in enumerate(nums):
            v = target - value
            if v in result:
                return [result[v], key]
            else:
                result[value] = key
        
