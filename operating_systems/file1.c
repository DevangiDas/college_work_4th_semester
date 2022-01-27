/*WAP in c language to copy the content of one file to another and create a binary executable file of same programe to check if content can be copied or not*/

#include<stdio.h>
#include<stdlib.h>

void main()
		{
			FILE *f1,*f2;
			char ch;
			f1 = fopen("test_file_os.txt","r");
			f2 = fopen("to_be_copied_os.txt","w");

			while(1)
					{
						ch = fgetc(f1);

						if(ch == EOF)
							break;
						else
							putc(ch,f2);
					}
			
			printf("\nThe FILE is copied\n");
			fclose(f1);
			fclose(f2);
		}
