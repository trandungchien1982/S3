package s3.services;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S3Service {

    @Autowired
    AmazonS3 amazonS3;

    public Bucket getOrCreateNewBucket(String bucketName){
        if(amazonS3.doesBucketExistV2(bucketName)){
            return null;
        }
        else return amazonS3.createBucket(bucketName);
    }

}
