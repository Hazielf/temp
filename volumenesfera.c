#include <stdio.h>

//Programa que calcula el volumen de una esfera

float elevar(float base, int exponente){
    float resultado = 1.0f;

    for (int i =0; i < exponente; i++) {
        resultado *= base;
    }
    return resultado;
}

int main(void) {
    constexpr float pi = 3.1415f;
    float radioEsfera;
    float volumenEsfera;

    //vEsfera = 4/3*pi*radio**2
    printf("Introduce el radio que tendra la esfera: ");
    scanf("%f", &radioEsfera);
    volumenEsfera = (4.0f/3.0f)*pi*(elevar(radioEsfera, 3));
    printf("\nEl volumen de la esfera es: %f", volumenEsfera);
    return 1;
}
