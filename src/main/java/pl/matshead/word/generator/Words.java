package pl.matshead.word.generator;

public enum Words {
    LOREM_IPSUM("Lorem Ipsum", new StringBuilder("Lorem ipsum dolor sit amet wisi. Phasellus vitae velit eleifend quam fermentum vestibulum. Donec suscipit rutrum. In id lacus euismod orci luctus elit, interdum malesuada. Etiam urna. Vestibulum enim. Duis ut ligula. Lorem ipsum pede, pulvinar risus. Morbi bibendum. Nulla convallis cursus dignissim a, fermentum pellentesque sapien. Fusce iaculis, purus fringilla mi, eu tempor risus. Fusce condimentum tempor, pulvinar mollis, orci molestie placerat, nulla ornare arcu erat, ut urna. Donec in quam congue urna. Pellentesque fringilla sit amet leo. Ut sagittis, mi mauris, consequat eu, pulvinar interdum. Suspendisse in nunc. Maecenas pharetra accumsan eget, aliquet ultrices bibendum, tellus. Integer condimentum.")),
    PAN_TADEUSZ("Pan Tadeusz", new StringBuilder("Litwo! Ojczyzno moja! Ty jesteś jak zdrowie. Nazywał się możemy na kształt deski. Nogi miał i przepraszał Sędziego. Sędzia gości niewiele z nami ruszysz, Sędzio, mój Tadeuszu, żeś zza Niemna odebrał wiadomość. może by przy boku sąsiadki a my razem ja wam służyć, moje panny Róży a Pan świata wie, jak wiadomo, krzepcy, otyli i przyjaciel domu). Widząc gościa, na parkanie stała młoda dziewczyna. - smyk w pustki prowadzić. Po cóż by nie uchybił kom w jakim stanie trudno zaradzić wolał gości Daleki krewny pański i Bernatowicze, Kupść, Gedymin i wieś rozweselić. Tadeusz Telimenie, Asesor zaś Gotem. Dość, że miał.")),
    ENTER_SANDMAN("Enter Sandman", new StringBuilder("Say your prayers little one Don't forget, my son To include everyoneTuck you in, warm within Keep you free from sin Till the sandman he comes Sleep with one eye open Gripping your pillow tight Exit light Enter night Take my hand Off to never never land Something's wrong, shut the light Heavy thoughts tonight And they aren't of snow white Dreams of war, dreams of liars Dreams of dragon's fire And of things that will bite Sleep with one eye open Gripping your pillow tight Exit light Enter night Take my hand Off to never never land Now OhYeee!"))
    ;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    Words(String category) {
        this.category = category;
    }

    private String category;
    private StringBuilder words;

    public StringBuilder getWords() {
        return words;
    }

    public void setWords(StringBuilder words) {
        this.words = words;
    }

    Words(String category, StringBuilder words) {
        this.category = category;
        this.words = words;
    }
}
