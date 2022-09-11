class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) == 0:
            return True
        
        pos = 0
        
        for char in t:
            if char == s[pos]:
                pos += 1
                
            if pos == len(s):
                return True
        
        return False