#define _CRT_SECURE_NO_WARNINGS
#include "SList.h"

int main()
{
	SLTNode* plist = NULL;
	SListPushBack(&plist, 1);
	SListPushBack(&plist, 2);
	SListPushBack(&plist, 3);
	SListPrint(plist);

	SListPushFront(&plist, 4);
	SListPushFront(&plist, 5);
	SListPushFront(&plist, 6);
	SListPrint(plist);

	SListPopFront(&plist);
	SListPopFront(&plist);
	SListPrint(plist);

	SLTNode* pos = SListFind(plist, 4);
	SListInsert(&plist, pos, 6);
	SListPrint(plist);

	pos = SListFind(plist, 3);
	SListErase(&plist, pos);
	SListPrint(plist);
	return 0;
}