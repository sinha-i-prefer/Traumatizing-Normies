class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        var left = 0
        var right = people.size-1
        var count = 0
        var count2 = 0
        while(left<=right){
            if(people[left]+people[right]<=limit){
                count++
                left++
                right--
            }
            else{
                right--
                count++
            }
        }
        return count
    }
}
