class Solution:
    def merge(self, intervals: list[list[int]]) -> list[list[int]]:
        intervals.sort(key = lambda f: f[0])

        merged = [intervals[0]]

        for i in range(1, len(intervals)):
            lastElemOfPrev = merged[-1][-1]
            firstElemOfCurr = intervals[i][0]
            lastElemOfCurr = intervals[i][-1]

            if lastElemOfPrev >= firstElemOfCurr:
                # firstElemOfPrev
                merged[-1][-1] = max(lastElemOfPrev, lastElemOfCurr)
            else:
                merged.append(intervals[i])

        return merged
