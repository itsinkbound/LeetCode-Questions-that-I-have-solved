
from collections import deque
class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        m=len(grid)
        n=len(grid[0])
        rotten = deque()
        fresh=0
        for r in range(m):
            for c in range(n):
                if grid[r][c] ==2 :
                    rotten.append((r,c,0))
                elif grid[r][c] ==1 :
                    fresh+=1
        if fresh == 0:
            return 0
        return findmin(self,grid,rotten,fresh,m,n)
        
def findmin(self,grid,rotten,fresh,m,n) -> int :
    dir = [(-1,0),(1,0),(0,-1),(0,1)]
    time = 0
    while rotten :
        r,c,t = rotten.popleft()
        time = max(t,time)
        for i,j in dir :
            nr,nc = r+i,c+j
            if 0<=nr<m and 0<=nc<n and grid[nr][nc]==1:
                grid[nr][nc] =  2
                rotten.append((nr,nc,t+1))
                fresh-=1
    return time if fresh == 0 else -1


