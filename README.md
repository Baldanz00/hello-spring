🌱 Hello Spring MVC
Progetto di allenamento con Spring Boot, Spring MVC e Thymeleaf. Raccoglie esempi pratici di controller, passaggio di dati alla vista, template con frammenti riutilizzabili e una piccola gestione di utenti con pagina di dettaglio.
Pensato come base di codice già pronta da riutilizzare per nuovi progetti.

✨ Funzionalità
Controller MVC (@Controller) che restituiscono template Thymeleaf
Controller REST (@RestController) che restituiscono testo semplice
Passaggio di dati alla vista tramite Model
Parametri di richiesta (@RequestParam) e variabili di percorso (@PathVariable)
Redirect tra endpoint
Lista utenti con pagina di dettaglio per codice personale
Frammenti Thymeleaf riutilizzabili (navbar e pulsante)
Interfaccia con Bootstrap 5.1.3 tramite WebJars

🛠️ Tecnologie
Java
Spring Boot (Spring Web)
Thymeleaf
Bootstrap 5.1.3 (WebJars)
Maven

🌐 Endpoint disponibili
Metodo	URL	            Descrizione
GET	/saluta?nome=Mario	Risponde con un saluto e l'ora attuale (testo)
GET	/greeting?nome=Mario	Pagina Thymeleaf con esempi di espressioni, oggetti, liste e frammenti
GET	/index/	Home con titolo e data/ora formattata
GET	/index/welcome	Risposta HTML diretta tramite @ResponseBody
GET	/index/greeting-redirect	Redirect verso /greeting
GET	/index/utenti/	Elenco di tutti gli utenti
GET	/index/utenti/{id}	Dettaglio dell'utente con quel codice personale (es. /index/utenti/1234)
