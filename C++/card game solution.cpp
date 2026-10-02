#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);

    char a[110], b[110];
    int t = 0, h = 0;

    for (int i = 0; i < n; i++) {
        scanf("%s %s", a, b);

        int c = strcmp(a, b);

        if (c > 0) t += 3;
        else if (c < 0) h += 3;
        else { t++; h++; }
    }

    printf("%d %d\n", t, h);

    return 0;
}
