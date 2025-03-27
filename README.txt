# Git README

## Descripció
Aquest projecte conté diversos exercicis de programació en Java relacionats amb l'us de Genèrics.

## Exercicis

### Nivell 1

#### Exercici 1
Crea una classe anomenada `NoGenericMethods` que emmagatzemi tres arguments del mateix tipus. Implementa mètodes per emmagatzemar i extreure aquests objectes, i un constructor per inicialitzar-los.
Comprova que els arguments es poden posar en qualsevol posició a la crida del constructor.

#### Exercici 2
Crea una classe anomenada `Persona` amb els atributs `nom`, `cognom` i `edat`. Després, crea una classe `GenericMethods` amb un mètode genèric que accepti tres arguments de tipus genèric. Aquest mètode ha d'imprimir per pantalla els arguments rebuts.

Al `main()` de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres, per exemple:
- Un objecte de la classe `Persona`
- Un `String`
- Un tipus primitiu

D'aquesta manera, es comprova que el mètode pot acceptar qualsevol tipus de paràmetre i en qualsevol ordre.

### Nivell 2

#### Exercici 1
Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.

#### Exercici 2
Modifica l'exercici anterior de manera que els arguments del mètode genèric siguin una llista d'arguments de longitud variable.

### Nivell 3

#### Exercici 1
Per aquest exercici, necessites:
- Una interfície `Telefon` amb un mètode `trucar()`.
- Una classe `Smartphone` que implementi `Telefon` i que a més tingui un mètode addicional `ferFotos()`.
- Una classe `Generica` amb dos mètodes genèrics:
  - El primer ha de rebre un tipus d'argument limitat per la interfície `Telefon`.
  - El segon ha de rebre un argument limitat per la classe `Smartphone`.

Aquests mètodes han de cridar els mètodes corresponents de `Telefon` i `Smartphone`.

Al `main()` de la classe `Principal`, passa un objecte de `Smartphone` als dos mètodes genèrics de `Generica`.

**Pregunta:** El mètode limitat per la interfície `Telefon` de la classe `Generica` pot cridar al mètode `ferFotos()`?

## Requisits
- Java 8 o superior
- IDE recomanat: Eclipse o IntelliJ
- Compliment de les bones pràctiques especificades a l'Sprint 0
- El codi ha d'estar en anglès

## Instal·lació
1. Clona aquest repositori:
   ```bash
   git clone https://github.com/Unrotopo/Sprint1_Tasca6.git
   ```
2. Obre el projecte en l'IDE de la teva elecció.
3. Configura el projecte com a Maven/Gradle o un projecte Java normal segons correspongui.
4. Executa els fitxers `main()` per provar els exercicis.

## Contribució
Si vols contribuir al projecte:
1. Fes un fork del repositori.
2. Crea una branca nova per a la teva funcionalitat o correcció:
   ```bash
   git checkout -b feature/nom-funcio
   ```
3. Fes commits i puja els canvis al teu fork.
4. Envia un Pull Request per revisar els canvis.

## Autoría

Aquest repositori ha sigut desenvolupat per Luis Portas Montero


