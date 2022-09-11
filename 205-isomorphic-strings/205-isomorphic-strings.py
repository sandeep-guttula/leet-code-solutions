class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dicS, dicT ={},{}
        for i in range(len(s)):
             if ((s[i] in dicS and dicS[s[i]] != t[i]) or (t[i] in dicT and dicT[t[i]] != s[i])):
                  return False
             dicS[s[i]] = t[i]
             dicT[t[i]] = s[i]
        return True