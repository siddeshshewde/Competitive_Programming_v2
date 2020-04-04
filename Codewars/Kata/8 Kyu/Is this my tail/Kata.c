#include <string.h>

int correct_tail(const char *body, const char *tail) {
    int i=0;
    while (body[i+1] != '\0')
  	{
    	  i++;	
  	} 
    printf("%c",body[i]);
 	  if (body[i] == tail[0])
    	  return 1;
  	else
    	  return 0;
}
