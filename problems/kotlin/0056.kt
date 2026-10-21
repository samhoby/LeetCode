class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortWith { a, b  -> a[0].compareTo(b[0]) }

        val merged = mutableListOf<IntArray>(intervals[0])

        for (i in 1..intervals.lastIndex) { 
            val lastElemOfPrev = merged.last().last()
            val firstElemOfCurr = intervals[i][0]
            val lastElemOfCurr = intervals[i].last()

            if (lastElemOfPrev >= firstElemOfCurr) {
                // lastElemOfPrev
                merged.last()[1] = maxOf(lastElemOfPrev, lastElemOfCurr)
            } else {
                merged.add(intervals[i])
            }
        }

        return merged.toTypedArray()
    }
}