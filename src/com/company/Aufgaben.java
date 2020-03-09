static String skiflugRanking(double flugweite) {
        String einleitung = "Ergebnis: ";
        String ergebnis = "nicht verfügbar";
        String warnung = "Verletzung! ACHTUNG: Hile holfen!";

        if (flugweite > 198.7) {
        ergebnis = "Gold";
        } else if (flugweite > 197.1) {
        ergebnis = "Silber";
        } else if (flugweite > 195) {
        ergebnis = "Bronze";
        } else if (flugweite > 193.67) {
        ergebnis = "Blech";
        } else if (flugweite >= 100 && flugweite <= 150) {
        ergebnis = "Ausgeschieden";
        }
        // 0.c.a
        if (flugweite >= 20 && flugweite <= 50) {
        return warnung;
        } else {
        return einleitung + ergebnis;
        }
        }