#include<iostream>
using namespace std;

int checkprime(int n) {
	int i;
	if(n == 1 || n == 0)
		return 0;
	for(i=2; i*i<=n; i++) {
		if(n % i == 0)
			return 0;
	}
	return 1;
}

int main() {
	int t;
	cin>>t;
	while(t--) {
		int m, n;
		cin>>m>>n;
		int i;
		for(i=m; i<=n; i++) {
			int k;
			k = checkprime(i);
			if(k)
				cout<<i<<endl;
		}
		cout<<endl;
	}
	return 0;
}