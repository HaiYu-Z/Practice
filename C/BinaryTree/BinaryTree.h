#pragma once
#include <stdio.h>

typedef char BTDataType;
typedef struct BinaryTreeNode
{
	struct BinaryTreeNode* left;
	struct BinaryTreeNode* right;
	BTDataType data;
}BTNode;

void PrevOrder(BTNode* root);
void InOrder(BTNode* root);
void PostevOrder(BTNode* root);