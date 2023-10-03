class Solution:
    def reverseWords(self, s: str) -> str:
        lst = s.split(" ")
        for i in range(len(lst)):
            lst[i] = list(lst[i])
            lst[i].reverse()
            lst[i] = "".join(lst[i])
        return " ".join(lst)