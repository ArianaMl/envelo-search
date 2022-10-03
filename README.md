# envelo-search
1.A. W jakim celu używa się klas abstrakcyjnych, a w jakim interfejsów?

Celem stosowania interfejsów jest opisanie zachowania obiektu nie posiadają stanu. Klasy abstrakcyjne stosuje się w celu przetrzymania jakiegoś stanu, kiedy nie potrzebne jest tworzenie instancji tego obiektu. Jako nadklasę dla pól wspólnych np. w DTO.
Przykładowo klasa dziedziczy np. pola z klasy abstrakcyjnej a implementuje metody z interfejsu. Nie mam na myśli że wybiera co dziedziczy po trochu jedynie zakreślam, kiedy potrzebuje pól zastosowane mogą być klasy abstrakcyjne, a dla metod interfejsy.  

1.B. Czym różni się tablica od listy liniowej?

Tablica ma określony rozmiar zadeklarowany wcześniej. Do listy liniowej możemy dowolnie dodawać elementy bez określenia ich rozmiaru. 
Położenie elementu w tablicy jest przydzielone podczas kompilacji natomiast dla listy liniowej element przypisywany jest w czasie wykonywania.
W celu usunięcia elementu z tablicy niezbędne jest wykonanie przesunięcia wszystkich elementów po nim. W liście wykonuje się to jedna komendą.
Tablica zajmuje mniej pamięci. 

2. Złożoność obliczeniowa Ο(n) – pętla wykonywana jest n razy, złożoność pamięciowa g(0).
