class Solution {
public:
    string removeDuplicates(string s) {
        //initialise ans string as empty string
        string ans = "";
        int n=s.length();

        for(int i=0; i<n; i++){
            char currCharacter = s[i];
            if(ans.empty()){
                //if ans is empty, seedha push karo
                ans.push_back(currCharacter);
            } // rightmost character of ans = ans.back()
            else if(currCharacter == ans.back()){
                ans.pop_back();
            }
            else if(currCharacter != ans.back()){
                ans.push_back(currCharacter);
            }
        }
        return ans;

    }
};