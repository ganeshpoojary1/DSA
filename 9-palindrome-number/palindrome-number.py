class Solution:
    def isPalindrome(self, num: int) -> bool:
        temp=num
        rev=0
        while num>0:
            digit=num%10
            rev=rev * 10 + digit
            num=num // 10
        return temp==rev