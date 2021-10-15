require './app/mission_d_191.rb'

describe '体温チェック' do
  describe '出力結果のテスト' do
    let(:missionD191) { MissionD191.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "37.1\n"
      expect($stdout).to receive(:puts).with('NG')
      missionD191.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "36.3\n"
      expect($stdout).to receive(:puts).with('OK')
      missionD191.run
    end
  end
end
