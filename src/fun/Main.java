package fun;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        // 1) Read input: first line is the paragraph
        String paragraph = "";
        if (sc.hasNextLine()) paragraph = sc.nextLine();

        // 2) Read the sorting mode (0 or 1). Default to 0 on parse errors.
        int mode = 0;
        if (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                try { mode = Integer.parseInt(line); } catch (NumberFormatException e) { mode = 0; }
            }
        }

        // 3) Normalize: lowercase and replace non-letter/digit characters with space.
        //    Use Unicode letter class so non-ASCII letters are handled too.
        String normalized = paragraph.toLowerCase().replaceAll("[^\\p{L}\\p{N}\\s]+", " ");

        // 4) Tokenize
        String[] tokens = normalized.trim().isEmpty() ? new String[0] : normalized.trim().split("\\s+");

        // 5) Count words
        Map<String, Integer> freq = new HashMap<>();
        for (String t : tokens) {
            if (t.isEmpty()) continue;
            freq.put(t, freq.getOrDefault(t, 0) + 1);
        }

        // 6) Prepare entries for sorting
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());

        if (mode == 0) {
            // Alphabetical by word (ascending)
            entries.sort(Comparator.comparing(Map.Entry::getKey));
        } else {
            // Frequency descending; tie-breaker: word ascending
            entries.sort((e1, e2) -> {
                int cmp = Integer.compare(e2.getValue(), e1.getValue()); // desc freq
                if (cmp != 0) return cmp;
                return e1.getKey().compareTo(e2.getKey()); // asc word
            });
        }

        // 7) Print results
        StringBuilder out = new StringBuilder();
        for (Map.Entry<String, Integer> e : entries) {
            out.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
        }
        System.out.print(out.toString());
    }
}
