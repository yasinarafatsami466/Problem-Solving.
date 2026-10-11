#include <stdio.h>

int main() {
    int N, M;
    scanf("%d %d", &N, &M);

    int x;
    int count = 0;

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            scanf("%d", &x);
            if (x == 0)
                count++;
        }
    }

    printf("%d\n", count);

    return 0;
}
