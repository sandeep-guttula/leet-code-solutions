class Solution:
    def isPalindrome(self, x: int) -> bool:
        lst = []
        if( x >= 0):
            if(x <= 9):
                return True
            for i in str(x):
                lst.append(i)
            lst.reverse()
            temp = "".join(lst)
            return x == int(temp)
        else:
            return False