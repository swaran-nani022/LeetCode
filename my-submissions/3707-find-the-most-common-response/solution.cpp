class Solution {
public:
    string findCommonResponse(vector<vector<string>>& responses) {
        unordered_map<string, int> freq;

        for (auto& daily : responses) {
            unordered_set<string> unique(daily.begin(), daily.end());
            for (auto& resp : unique) {
                freq[resp]++;
            }
        }

        int maxFreq = 0;
        string result = "";

        for (auto& [response, count] : freq) {
            if (count > maxFreq || (count == maxFreq && response < result)) {
                maxFreq = count;
                result = response;
            }
        }

        return result;
    }
};
