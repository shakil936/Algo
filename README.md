#Algo
C
{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Riched20 10.0.10240}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 #include<stdio.h>\par
void swap(int *israt, int *esha)\par
\{\par
\tab int temp= *israt;\par
\tab *israt=*esha;\par
\tab *esha= temp;\par
\}\par
void selectionSort(int arr[],int n)\par
\{\par
\tab int i, j, min_idx;\par
\tab for (i=0; i<n-1;i++)\par
\tab\{\par
\tab\tab min_idx =1;\par
\tab\tab for(j=i+1; j<n;j++)\par
\tab\tab if(arr[j]<arr[min_idx])\par
\tab\tab min_idx=j;\par
\tab\tab swap(&arr[min_idx],&arr[i]);\par
\tab\}\par
\}\par
void printArray(int arr[], int size)\par
\{\par
\tab int i;\par
\tab for (i=0;i<size;i++)\par
\tab printf("%d",arr[i]);\par
\tab printf("\\n");\par
\}\par
int main()\par
\{\par
\tab int arr[]=\{65 ,5;14;22;11\};\par
\tab int n=sizeof(arr);\par
\tab selectionSort(arr,n);\par
\tab printf("sorted array: \\n");\par
\tab printfArray(arr,n);\par
\tab return 0;\par
\}\par
}
