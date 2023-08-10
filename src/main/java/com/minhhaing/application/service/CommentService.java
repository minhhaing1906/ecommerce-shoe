package com.minhhaing.application.service;

import com.minhhaing.application.entity.Comment;
import com.minhhaing.application.model.request.CreateCommentPostRequest;
import com.minhhaing.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
