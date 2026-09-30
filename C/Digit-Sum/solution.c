#include <stdio.h>
#include <string.h>

int main() {
    char x[1100];

    while (1) {
        scanf("%s", x);

        if (strcmp(x, "0") == 0) {
            break;
        }

        int sum = 0;
        for (int i = 0; x[i] != '\0'; i++) {
            sum += x[i] - '0';
        }

        printf("%d\n", sum);
    }

    return 0;
}
