import sys
#sys를 import 해줍니다.
input = sys.stdin.readline
#input함수를 재정의해줍니다. 

N = int(input())
#이진트리 노드의 갯수를 입력받습니다.

gh = dict()
#트리를 저장할 딕셔너리

for _ in range(N):
  root, left, right = input().split()
  gh[root] = (left, right)
#트리를 저장합니다.

#전위순회하는 함수 preorder
def preorder(root):
  print(root, end="")
#root를 먼저 출력
  if gh[root][0] != ".":
    preorder(gh[root][0])
#left가 null이 아니라면 left를 root로 하여 전위순회 수행
  if gh[root][1] != ".":
    preorder(gh[root][1])
#right가 null이 아니라면 right를 root로 하여 전위순회 수행

#중위순회하는 함수 Inorder    
def Inorder(root):
  if gh[root][0] != ".":
    Inorder(gh[root][0])
#left가 null이아니라면 left를 root로 하는 중위순회 수행
  print(root, end ="")
#root를 출력
  if gh[root][1] != ".":
    Inorder(gh[root][1])
#right가 null이아니라면 right를 root로 하는 중위순회 수행
    

#후위순회하는 함수 postOrder 
def postOrder(root):
  if gh[root][0] != ".":
    postOrder(gh[root][0])
#left가 null이 아니라면 left를 root로 하는 postOrder 수행 
  if gh[root][1] != ".":
    postOrder(gh[root][1])
#right가 null이 아니라면 right를 root로 하는 postOrder 수행
  print(root, end ="")
#root 출력
  
preorder("A")
print()
Inorder("A")
print()
postOrder("A")
print()

#모든 트리의 루트는 A이므로 A에대하여 전위순회, 중위순회, 후위순회를 실시한다.