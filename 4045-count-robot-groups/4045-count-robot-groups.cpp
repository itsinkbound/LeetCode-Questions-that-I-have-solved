class Solution {
public:
    int countGroups(vector<int>& position, vector<int>& speed, int distance) {
        int rightMaxRobot = -1;
        int n = position.size();
        vector<int> visited(n, 0);

        int ans = 0;

        for(int i = 0; i < n-1; i++) {
            if(position[i+1] - position[i] <= distance ) {
                // ans++;
                visited[i] = 1;
            }
        }

        for(int right = position.size()-1; right >= 0; right--) {
            // r3 -> r4
            if(rightMaxRobot == -1) {
                rightMaxRobot = right;
                continue;
            }

            if(visited[right] == 1) continue;


            int indexOfRightRobot = rightMaxRobot;

            int speedOfRightRobot = speed[indexOfRightRobot];
            int speedOfLeftRobot = speed[right];

            if(speedOfLeftRobot > speedOfRightRobot) {
                // ans++;
                // visited[right] = 1;
            } else {
                rightMaxRobot = right;
                ans++;
            }
        }
        // cout << "Visited array " << endl;
        // for(auto it: visited) cout << it << " ";

        return ans + 1;
    }
};