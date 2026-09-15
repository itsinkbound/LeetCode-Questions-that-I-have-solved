from collections import defaultdict

class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        adj_list = defaultdict(list)
        for u,v in prerequisites :
            adj_list[v].append(u)
        vis = [0]*numCourses

        def dfs(node) -> bool:
            vis[node]=1

            for i in adj_list[node]:
                if vis[i]==1 :
                    return False
                if vis[i]==0 and not dfs(i):
                    return False
            vis[node]=2
            return True
        for i in range(numCourses):
            if vis[i] == 0 and not dfs(i):
                return False
        return True
        