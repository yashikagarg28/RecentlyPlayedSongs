import java.util.LinkedHashMap;
import java.util.Map;

public class RecentlyPlayedStore {
    private final int capacity;
    private Map<String, LinkedList<String>> store;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        store = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public void addSong(String user, String song) {
        if (!store.containsKey(user)) {
            store.put(user, new LinkedList<>());
        }

        LinkedList<String> playlist = store.get(user);
        if (playlist.size() == capacity) {
            // If the playlist is full, remove the least recently played song
            playlist.removeFirst();
        }
        playlist.addLast(song);
    }

    public List<String> getRecentlyPlayedSongs(String user) {
        if (!store.containsKey(user)) {
            return new ArrayList<>();
        }
        return new ArrayList<>(store.get(user));
    }
}
