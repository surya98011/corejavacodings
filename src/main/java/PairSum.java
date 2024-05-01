//
//
//public class PairSum {
//
//        private PSGEnvironmentConfig psgEnvConfig;
//        private ReturnsWebClient returnsWebClient;
//        private CapToPSGPostRequestConverter capToPSGPostRequestConverter;
//        private PSGToCapPostResponseConverter psgToCapPostResponseConverter;
//        private AbsAuthenticatedApi absAuthenticatedApi;
//
//        public Mono<CAPReturnResponse> executeHttpRequest(String uri, PSGReturnRequest psgReturnRequest, WebClient webClient){
//
//            long startTime = System.currentTimeMillis();
//
//            Mono<CAPReturnResponse> returnResponseMono webClient.post()
//                    .uri(uri).
//                    body (Mono.just(psgReturnRequest), PSGReturnRequest.class).
//.retrieve()
//                    .onStatus(HttpStatusCode::is4xxClientError,
//
//                            clientResponse -> Mono.error(
//
//                                    new PSGRequestProcessException("Downstrean service Failed to process return:",
//
//                                            (HttpStatus) clientResponse.statusCode())))
//
//                    .onStatus(HttpStatusCode::is5xxServer Error,
//
//                            clientResponse Mono.error(
//
//                                    new PSGRequestProcessException("Downsteam service Failed to process return:{}",
//
//                                            (HttpStatus) clientResponse.statusCode())))
//
//            bodyToMono (PSGReturnResponse.class) Mono<PSGHeturn Response
//
//.map(psgReturnResponse -> psgToCapPostResponseConverter.convert(psgReturnResponse, psgReturnRequest));
//
//            Long endTime = System.currentTimeMillis();
//
//            Logger.info("Time taken: {}", endTime-startTime);
//            return returnResponseMono;
//        }
//    }
