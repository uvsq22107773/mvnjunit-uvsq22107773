# TP Maven-JUnit

Pour cet exercice, on veut implémenter une classe immuable Fraction qui représente un nombre rationnel.
Un exemple d’interface pour une telle classe est donné par la classe [`Fraction`](https://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/fraction/Fraction.html) de la bibliothèque [Apache Commons Math](https://commons.apache.org/proper/commons-math/).

La classe fournira l’interface suivante :
*   initialisation avec (i) un numérateur et un dénominateur, (ii) juste avec le numérateur (dénominateur égal à 1) ou (iii) sans argument (numérateur égal 0 et dénominateur égal à 1),
*   conversion en chaîne de caractères ([`toString`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#toString())),
*   les constantes ZERO (0, 1) et UN (1, 1),
*   consultation du numérateur et du dénominateur,
*   consultation de la valeur sous la forme d’un nombre en virgule flottante (double) (`toDouble`),
*   addition de deux fractions (`add`),
*   test d’égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) ([`equals`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)) et [`hashCode`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#hashCode())),
*   comparaison de fractions selon l’ordre naturel ([`compareTo`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html)).

De plus, le projet sera géré avec [Maven](https://maven.apache.org/) et vous utiliserez une approche pilotée par les tests pour la réalisation, i.e. écrivez toujours un test avant le code et pensez au refactoring.
Le framework de tests devra être [JUnit 4](https://junit.org/junit4/) (ou [5](https://junit.org/junit5/) si vous préférez).
Vous rédigerez votre code source en respectant les [conventions de codage](https://google.github.io/styleguide/javaguide.html) proposées par _Google_.
Enfin, la prise en compte des contraintes se fera par de la gestion d’erreurs et des exceptions.


Il pourra éventuellement être nécessaire de [configurer le proxy](http://maven.apache.org/guides/mini/guide-proxies.html) (http://wwwcache.uvsq.fr:3128) pour accéder au dépôt Maven.

À chaque étape, validez vos modifications avec `git` et si nécessaire, exécutez le cycle maven adapté pour vérifier vos manipulations.

1. Quelles conventions utilise Maven pour l’arborescence des répertoires ?
    Où se trouvent les sources de l'application et les sources des tests ?
    utilise le fichier pom.xml
    les fichiers source de l'application : src/Main/java
    les fichiers source du test : src/test/java
2. Examinez le projet Maven ainsi que le fichier de description et répondez aux questions suivantes :
    1. Dans quel répertoire se trouvent les fichiers sources du projet ? Les sources des tests ?
       les fichiers source du projet : src/Main/java
       les fichiers source du test : src/test/java
    2. Quelles sont les coordonnées du projet ?
       <modelVersion>4.0.0</modelVersion>
       <groupId>fr.uvsq.cprog</groupId>
       <artifactId>mvnjunit</artifactId>
       <version>1.0-SNAPSHOT</version>
       <name>mvnjunit</name>
    3. À quoi sert la propriété `project.build.sourceEncoding` ?
        configure le codage du projet en maven, dans notre project 'UTF-8' est specifie
    4. Quelles versions des sources et de la JVM sont utilisés ?
        1.7 7 jvm
    5. Quelle version de JUnit est configurée ? À quoi sert la balise `scope` ?
        JUnit : 4.11
    6. À quoi sert la section `pluginManagement` ?
       est un élément qui fait La gestion des plugins contient les éléments des plugins de la même manière
3. Modifiez la configuration du projet de la façon suivante :
    1. fixez la version des sources et des .class pour utiliser la version 11 de Java
       <maven.compiler.source>1.11</maven.compiler.source>
    2. utilisez la dernière version stable de JUnit 4 (cf. [MVNRepository](https://mvnrepository.com/))
4. Ajoutez un fichier `.gitignore` adapté aux projets Maven (cf. [A collection of .gitignore templates](https://github.com/github/gitignore)) et ajoutez-y les fichiers et répertoires de votre IDE.
5. Quelle commande Maven permet de :
    1. créer un `jar` du projet ?
        mvn package
        il a cree le fichier executable jar mvnjunit-1.0-SNAPSHOT.jar
    2. lancer les tests ?
        en executant le AppTest.java
    3. supprimer tous les fichiers issus de la compilation ?
6. Ajoutez une classe `Fraction` et une classe `FractionTest` dans les répertoires et packages appropriés.
    Supprimez les classes d'exemple `App` et `AppTest`.
7. Énumérez une liste de cas de tests à réaliser en n'oubliant pas les cas d'erreur.
   assertTrue( true );
   assertEquals(obj.getNum(),5);
   assertNotNull(obj);
   assertNull(null);
   //assertNotSame(obj, obj1);
   assertSame(obj, obj1);
8. Pour chaque cas de test, écrivez le test JUnit correspondant dans la classe de test, vérifiez qu’il échoue,
implémentez la fonctionnalité dans la classe, vérifiez que le test passe, appliquez un étape de refactoring sur les tests et la classe si nécessaire.
9. Modifiez le POM pour intégrer la vérification des conventions de codage avec [`checkstyle`](http://maven.apache.org/plugins/maven-checkstyle-plugin/) en utilisant les conventions _Google_.
10. Ajoutez une méthode `main` qui démontre quelques fonctionnalités de la classe, puis modifiez le POM pour que le jar généré soit exécutable (cf. [Apache Maven JAR Plugin](https://maven.apache.org/plugins/maven-jar-plugin/index.html))
11. Modifiez la méthode `main` pour que les différents affichages se fassent à l'aide de la bibliothèque de logging [`SLF4J`](http://www.slf4j.org/)
12. En utilisant le plugin [assembly](https://maven.apache.org/plugins/maven-assembly-plugin/) (ou le plugin [shade](https://maven.apache.org/plugins/maven-shade-plugin/)), générez une archive du projet contenant ses dépendances (uber-jar)
