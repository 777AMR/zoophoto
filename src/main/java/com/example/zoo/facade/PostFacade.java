package com.example.zoo.facade;

import com.example.zoo.dto.PostDTO;
import com.example.zoo.entity.Post;
import org.springframework.stereotype.Component;

@Component
public class PostFacade {
    PostDTO postDTO = new PostDTO();

    public PostDTO postToPostDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setUsername(post.getUser().getUsername());
        postDTO.setId(post.getId());
        postDTO.setCaption(post.getCaption());
        postDTO.setLikes(post.getLikes());
        postDTO.setUserLiked(post.getLikedUsers());
        postDTO.setLocation(post.getLocation());
        postDTO.setTitle(post.getTitle());

        return postDTO;
    }
}
