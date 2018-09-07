#include <stdio.h>
#include <stdlib.h>

int main() {
   int totalMinutes, days, usedMinutes;

   printf("Enter number of minutes in the plan: ");
   scanf("%d", &totalMinutes);

   printf("Enter the current day in 30 day period: ");
   scanf("%d", &days);

   printf("Enter total minutes used so far: ");
   scanf("%d", &usedMinutes);

   int daysLeft = 30 - days;
   double averageUse = (double) usedMinutes / days;
   double recommendedUse = (double) totalMinutes / 30;

   if (days <= 30) {
        printf("\n%d days used, %d days remaining\n", days, daysLeft);
        printf("Average daily use: %.2lf min/day\n\n", averageUse);
        if (averageUse > recommendedUse) {
            printf("You are EXCEEDING your average daily use (%.2lf min/day), \ncontinuing this high usage, you'll exceed your minute plan by \n%.1lf minutes\n\n", recommendedUse, (averageUse * 30) - totalMinutes);
            printf("To stay below your minute plan, use no more than %.1lf min/day.\n", (double)(totalMinutes - usedMinutes) / daysLeft);
        } else {
            printf("You are not exceeding your average daily use(%.2lf min/day)", recommendedUse);
        }
   } else {
       printf("Invalid Day Input");
   }

    return 0;
}
