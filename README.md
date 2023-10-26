# Recently Played Songs

This is a simple Java project that implements an in-memory store for recently played songs. It can accommodate N songs per user, with a fixed initial capacity, and has the capability to store a list of song-user pairs. When the store becomes full, it eliminates the least recently played songs.

## Project Structure

The project is organized as follows:


- `src/`: Contains the Java source code for the RecentlyPlayedStore class.
- `test/`: Contains the JUnit test cases for testing the RecentlyPlayedStore class.

## How It Works

The `RecentlyPlayedStore` class is responsible for managing recently played songs. It uses a `LinkedHashMap` to maintain the order of songs played, ensuring that the least recently played song is removed when the store becomes full.

### Adding Songs

To add a song for a user, you can use the `addSong(user, song)` method. If the user's playlist is full, the least recently played song will be removed to accommodate the new one.

```java
RecentlyPlayedStore store = new RecentlyPlayedStore(3);
store.addSong("user1", "S1");
store.addSong("user1", "S2");
store.addSong("user1", "S3");
