class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        count = 0
        brokenLetters = set(brokenLetters)
        for i in text.split():
            if brokenLetters.isdisjoint(set(i)):
                count += 1
        return count
        