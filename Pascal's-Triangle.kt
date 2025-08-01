class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val resList = mutableListOf<List<Int>>()
        for(i in 0 until numRows){
            val row = mutableListOf<Int>()
            for(j in 0..i){
                if(j==0||j==i){
                    row.add(1)
                }
                else{
                    val temp = resList[i-1][j]+resList[i-1][j-1]
                    row.add(temp)
                }
            }
            resList.add(row)
        }
        return resList
    }
}