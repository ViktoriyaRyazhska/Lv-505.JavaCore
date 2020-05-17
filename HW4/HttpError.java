package HW4;

public enum HttpError {
    BadRequest400 {
        @Override
        public String getHttpError() {
            return "Bad Request";
        }
    }, Unauthorized401{
        @Override
        public String getHttpError() {
            return "Unauthorized";
        }
    },PaymentRequired402{
        @Override
        public String getHttpError() {
            return "Payment Required";
        }
    }, Forbidden403{
        @Override
        public String getHttpError() {
            return "Forbidden";
        }
    }, NotFound404{
        @Override
        public String getHttpError() {
            return "Not Found";
        }
    }, MethodNotAllowed405{
        @Override
        public String  getHttpError() {
            return "Method Not Allowed";
        }
    }, NotAcceptable406{
        @Override
        public String  getHttpError() {
            return "Not Acceptable";
        }
    };

    public abstract String getHttpError();
}
