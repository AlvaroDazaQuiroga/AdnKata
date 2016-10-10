/**
 * Created by Administrator on 10/10/2016.
 */
public final class DnaStrand {
    /**
     * this class is replace and adn request .
     */
    private DnaStrand() {
    }

    /**
     * This method make a complement for the adn string  requested.
     *
     * @param adnPatron String adn requested.
     * @return String whit the new adn.
     */
    static String makeComplement(final String adnPatron) {
        return adnPatron.replace("A", "t")
                .replace("T", "a")
                .replace("C", "g")
                .replace("G", "c")
                .toUpperCase();
    }
}
