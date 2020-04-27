#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void create();
void display();
void modify();
 void append();
 void search();
 void sort();

 struct component
 {
 int srno;
 char refdes[3];
 int resist;
 float tolerance;
 }c1[8];
 struct component *p;

 int n;
 void main()
 {
 int ch;
 p=c1;
 printf("Enter the number of records to be handled\n");
 scanf("%d",&n);
 do
 {
printf("Enter your choice as per the menu:-\n1.Create\n2.Display\n3.Modify\n4.Append\n5.Search\n6.Sort\n");
 scanf("%d",&ch);

 switch(ch)
 {
 case 1: create();
 break;

 case 2: display();
 break;

 case 3: modify();
 break;

 case 4: append();
 break;

 case 5: search();
 break;

 case 6: sort();
 break;

 case 7: exit(1);

 default: printf("Enter a valid choice\n");
 }
 }
 while(ch!=7);
 }

 void create()
 {
 int i;
 printf("Enter the details in the following order:-\n1.Sr.No.\n2.RefDes\n3.Resistance\n4.Tolerance\n");
  for(i=0;i<n;i++)
 {
 scanf("%d%s%d%f",&(p+i)->srno,&(p+i)->refdes,&(p+i)->resist,&(p+i)->tolerance);
 }
 }


 void display()
 {
 int i;
 printf("The details are as follows:-\nSr No.\tRefDes\tResistance\tTolerance\n");
 for(i=0;i<n;i++)
 {

printf("%d\t%s\t%d\t\t%f\t\t\n",(p+i)->srno,(p+i)->refdes,(p+i)->resist,(p+i)->tolerance);
 }
 }

 void modify()
 {
 int sr,i;
 printf("Enter the Serial No. of the component to be modified\n");
 scanf("%d",&sr);
 for(i=0;i<=n;i++)
 {
 if(sr==(p+i)->srno)
 {
 printf("Enter the modified details\n");

scanf("%d%s%d%f",&(p+i)->srno,&(p+i)->refdes,&(p+i)->resist,&(p+i)->tolerance);
 display;
 break;
 }
 if(i==n)
 {
 printf("Invalid Input\n");
 }
 }
 }


 void append()
 {
 if(n>=8)
 {
 printf("There is no memory available to add more records");
 }
 else
 {
 printf("Enter the details for %d record\n",n+1);
 scanf("%d%s%d%f",&(p+n)->srno,&(p+n)->refdes,&(p+n)->resist,&(p+n)->tolerance);
 n=n+1;
 display();
 }
 }


 void search()
 {
 int i,j=1,ch;
 printf("Enter the Serial No. of the record to be searched.");
 scanf("%d",&ch);
 for(i=0;i<n;i++)
 {
 if(ch==(p+i)->srno)
 {
 printf("\nThe Record is found.\n");
 printf("\nThe record is:-\n\nSerial No.\tRefDes\tResistanceName\t\tTolerance\n" );

printf("%d\t\t%s\t\t%d\t\t%f\n\n",(p+i)->srno,(p+i)->refdes,(p+i)->resist,(p+i)->tolerance)
;
 j=0;
 }
 }
 if(j==1)
 {
 printf("\nThe record is not found.\n");
 }
 }


 void sort()
 {
 int i,j,l=0,k;
 struct temp
 {
 int temp1;
 char temp2[3];
 float temp3;
 int temp4;
 }t1[8];
 struct temp *q;
 q=t1;
 for(i=1;i<n;i++)
 {
 for(j=0;j<n-i;j++)
 {
 if((p+j)->tolerance>(p+j+1)->tolerance)
 {
 (q+j+1)->temp1=(p+j)->srno;
 (p+j)->srno=(p+j+1)->srno;
 (p+j+1)->srno=(q+j+1)->temp1;
 strcpy((q+j+1)->temp2,(p+j)->refdes);
strcpy((p+j)->refdes,(p+j+1)->refdes);
 strcpy((p+j+1)->refdes,(q+j+1)->temp2);
 (q+j+1)->temp3=(p+j)->tolerance;
 (p+j)->tolerance=(p+j+1)->tolerance;
 (p+j+1)->tolerance=(q+j+1)->temp3;
 (q+j+1)->temp4=(p+j)->resist;
 (p+j)->resist=(p+j+1)->resist;
 (p+j+1)->resist=(q+j+1)->temp4;
 l++;
 }
 }
 }
 display();
 printf("\n\nTotal No. of swappings that took place=%d\n",l);
 k=(n-1)*(n/2);
 if(l==0)
 {
 printf("\nThis is the best case\n");
 }
else if (l<k)
 {
 printf("\nThis is the avg case\n");
 }
 else
 {
 printf("\nThis is the worst case\n");
 }
}


 /*Output:-
196 Enter the number of records to be handled
197 3
198 Enter your choice as per the menu:-
199 1.Create
200 2.Display
201 3.Modify
202 4.Append
203 5.Search
204 6.Sort
205 1
206 Enter the details in the following order:-
207 1.Sr. No.
208 2.RefDes
209 3.Resistance
210 4.Tolerance
211 3
212 R3
213 3000
214 0.3
215 2
216 R2
217 2000
218 0.2
219 1
220 R1
221 1000
222 0.1
223 Enter your choice as per the menu:-
224 1.Create
225 2.Display
226 3.Modify
227 4.Append
228 5.Search
229 6.Sort
230 2
231 The details are as follows:-
232 Sr No. RefDes Resistance Tolerance
233 3 R3 3000 0.300000
234 2 R2 2000 0.200000
235 1 R1 1000 0.100000
236 Enter your choice as per the menu:-
237 1.Create
238 2.Display
239 3.Modify
240 4.Append
241 5.Search
242 6.Sort
243 3
244 Enter the Serial No. of the component to be modified
245 3
246 Enter the modified details
247 4
248 R4
249 4000
250 0.4
251 Enter your choice as per the menu:-
252 1.Create
253 2.Display
254 3.Modify
255 4.Append
256 5.Search
257 6.Sort
258 2
259 The details are as follows:-
260 Sr No. RefDes Resistance Tolerance
261 4 R4 4000 0.400000
262 2 R2 2000 0.200000
263 1 R1 1000 0.100000
264 Enter your choice as per the menu:-
265 1.Create
266 2.Display
267 3.Modify
268 4.Append
269 5.Search
270 6.Sort
271 4
272 Enter the details for 4 record
273 3
274 R3
275 3000
276 0.3
277 The details are as follows:-
278 Sr No. RefDes Resistance Tolerance
279 4 R4 4000 0.400000
280 2 R2 2000 0.200000
281 1 R1 1000 0.100000
282 3 R3 3000 0.300000
283 Enter your choice as per the menu:-
284 1.Create
285 2.Display
286 3.Modify
287 4.Append
288 5.Search
289 6.Sort
290 2
291 The details are as follows:-
292 Sr No. RefDes Resistance Tolerance
293 4 R4 4000 0.400000
294 2 R2 2000 0.200000
295 1 R1 1000 0.100000
296 3 R3 3000 0.300000
297 Enter your choice as per the menu:-
298 1.Create
299 2.Display
300 3.Modify
301 4.Append
302 5.Search
303 6.Sort
304 5
305 Enter the Serial No. of the record to be searched.3
306
307 The Record is found.
308
309 The record is:-
310
311 Serial No. RefDes Resistance Name Tolerance
312 3 R3 3000 0.300000
313
314 Enter your choice as per the menu:-
315 1.Create
316 2.Display
317 3.Modify
318 4.Append
319 5.Search
320 6.Sort
321 6
322 The details are as follows:-
323 Sr No. RefDes Resistance Tolerance
324 1 R1 1000 0.100000
325 2 R2 2000 0.200000
326 3 R3 3000 0.300000
327 4 R4 4000 0.400000
328
329
330 Total No. of swappings that took place=4
331
332 This is the avg case
333 Enter your choice as per the menu:-
334 1.Create
335 2.Display
336 3.Modify
337 4.Append
338 5.Search
339 6.Sort
340 */
