#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char **argv) {

    double years, initialValue, finalValue;

    printf("Initial Value: ");
    scanf("%lf", &initialValue);

    printf("Final Value: ");
    scanf("%lf", &finalValue);

    printf("Years: ");
    scanf("%lf", &years);

    double rateNum = (pow((finalValue / initialValue), (1 / years))) * 100 - 100;

    printf("Annualized Rate of Return: %.3lf", rateNum);

    return 0;
}
