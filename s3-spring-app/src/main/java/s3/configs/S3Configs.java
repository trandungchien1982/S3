package s3.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

/**
 * Create beans for interactions with S3
 */
@Configuration
public class S3Configs {

    @Value("${s3.server-url}")
    String s3ServerUrl;

    @Value("${s3.access-key}")
    String accessKey;

    @Value("${s3.secret-key}")
    String secretKey;

    @Bean
    S3Client s3Client() {
        Region awsRegion = Region.AWS_GLOBAL;
        return S3Client.builder()
                .region(awsRegion)
                .credentialsProvider(ProfileCredentialsProvider.create("default"))
//                .credentialsProvider(ProfileCredentialsProvider)
                .build();
    }

    @Bean
    AwsCredentials getCredentials() {
        return new AwsBasicCredentials(accessKey,secretKey);
    }


}
