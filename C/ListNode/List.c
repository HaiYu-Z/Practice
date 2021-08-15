#define _CRT_SECURE_NO_WARNINGS
#include "List.h"

ListNode* BuyListNode(LTDataType x)
{
	ListNode* newnode = (ListNode*)malloc(sizeof(ListNode));
	if (newnode == NULL)
	{
		perror("BuyListNode");
		exit(-1);
	}
	newnode->data = x;
	newnode->prev = NULL;
	newnode->next = NULL;
	return newnode;
}

ListNode* ListInit()
{
	ListNode* phead = BuyListNode(0);
	phead->next = phead;
	phead->prev = phead;

	return phead;
}

void ListDestory(ListNode* phead)
{
	assert(phead);
	ListNode* cur = phead->next;
	while (cur != phead)
	{
		ListNode* next = cur->next;
		free(cur);
		cur = next;
	}
	free(phead);
	phead = NULL;

}

void ListPrint(ListNode* phead)
{
	assert(phead);
	ListNode* cur = phead->next;
	while (cur != phead)
	{
		printf("%d ", cur->data);
		cur = cur->next;
	}
	printf("\n");
}

void ListPushBack(ListNode* phead, LTDataType x)
{
	assert(phead);
	//ListNode* newnode = BuyListNode(x);
	//ListNode* tail = phead->prev;

	//tail->next = newnode;
	//newnode->prev = tail;
	//newnode->next = phead;
	//phead->prev = newnode;

	ListInsert(phead, x);
}

void ListPushFront(ListNode* phead, LTDataType x)
{
	assert(phead);
	//ListNode* newnode = BuyListNode(x);
	//ListNode* first = phead->next;
	//first->prev = newnode;
	//newnode->next = first;
	//newnode->prev = phead;
	//phead->next = newnode;

	ListInsert(phead->next, x);
}

void ListPopFront(ListNode* phead)
{
	assert(phead);
	assert(phead->next != phead);
	//ListNode* first = phead->next;
	//ListNode* second = first->next;
	//second->prev = phead;
	//phead->next = second;
	//free(first);

	ListErase(phead->next);
}

void ListPopBack(ListNode* phead)
{
	assert(phead);
	//ListNode* tail = phead->prev;
	//ListNode* prev = tail->prev;
	//prev->next = phead;
	//phead->prev = prev;
	//free(tail);

	ListErase(phead->prev);
}

ListNode* ListFind(ListNode* phead, LTDataType x)
{
	assert(phead);
	ListNode* pos = phead->next;
	while (pos != phead)
	{
		if (pos->data == x)
		{
			return pos;
		}
		pos = pos->next;
	}
	return NULL;
}

// pos位置之前插入x
void ListInsert(ListNode* pos, LTDataType x)
{
	assert(pos);
	ListNode* prev = pos->prev;
	ListNode* newnode = BuyListNode(x);
	pos->prev = newnode;
	newnode->next = pos;
	newnode->prev = prev;
	prev->next = newnode;

}

// 删除pos位置的值
void ListErase(ListNode* pos)
{
	assert(pos);
	ListNode* next = pos->next;
	ListNode* prev = pos->prev;
	next->prev = prev;
	prev->next = next;
	free(pos);
	pos = NULL;
}
