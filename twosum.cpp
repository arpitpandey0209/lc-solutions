class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> m;
        vector<int> solution;
        for(int i=0;i<nums.size();i++) {
            if(m.find(target-nums[i]) != m.end()) {
                solution.push_back(m[target-nums[i]]);
                solution.push_back(i);
                return solution;
            }
            m[nums[i]] = i;
        }
        return solution;
    }
};
