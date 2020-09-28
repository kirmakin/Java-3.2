package manager;

import ru.netology.domain.VKPost;

public class PostManager {
    private VKPost[] posts;
    VKPost vkPost = new VKPost();

    public VKPost[] search(int ownerId, String domain, String query, int ownersOnly, int count, int offset) {
        return null;
    }

    public void delete(int ID, int ownerId) {
    }

    public VKPost[] getPosts() {
        return posts;
    }
    public void setPosts(VKPost[] posts) {
        this.posts = posts;
    }
}
