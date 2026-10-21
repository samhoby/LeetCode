class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = HashMap<String, MutableList<String>>((strs.size / 0.75f).toInt() + 1)

        for (str in strs) {
            val count = CharArray(26)
            for (c in str) count[c - 'a']++

            groups.getOrPut(String(count)) { ArrayList() }.add(str)
        }
        return ArrayList(groups.values)
    }
}
